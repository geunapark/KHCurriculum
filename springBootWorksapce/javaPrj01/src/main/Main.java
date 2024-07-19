package main;

import com.google.gson.Gson;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B552584/UlfptcaAlarmInqireSvc/getUlfptcaAlarmInfo"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=akF9VKkwFRs9va7BaVDgPE7UotStMOUVdtodkUqIz4PAzHCawMrMPQLau4fxlqqZgdUO%2FX3gYFZQ%2FMYkfH9N9Q%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("returnType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*xml 또는 json*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
        urlBuilder.append("&" + URLEncoder.encode("year","UTF-8") + "=" + URLEncoder.encode("2024", "UTF-8")); /*측정 연도*/
        urlBuilder.append("&" + URLEncoder.encode("itemCode","UTF-8") + "=" + URLEncoder.encode("PM10", "UTF-8")); /*미세먼지 항목 구분(PM10, PM25), PM10/PM25 모두 조회할 경우 파라미터 생략*/

        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());

        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());


        //JSON -> 자바 객체 변환
        Gson gson = new Gson();
        ApiVo apiVo = gson.fromJson(sb.toString() , ApiVo.class);
        List<ItemVo> itemList = apiVo.getResponse().getBody().getItems();
        //커넥션 생성
        Connection dbConn = JDBCTemplate.getConnection();

        for (ItemVo itemVo : itemList) {
            //INSERT 쿼리 실행
            String sql = "INSERT INTO AIR_KOREA(DISTRICT_NAME , ISSUE_GBN) VALUES(? , ?)";
            PreparedStatement pstmt = dbConn.prepareStatement(sql);
            pstmt.setString(1,itemVo.getDistrictName());
            pstmt.setString(2,itemVo.getIssueGbn());
            int result = pstmt.executeUpdate();
            System.out.println("result = " + result );

        }



    }
}