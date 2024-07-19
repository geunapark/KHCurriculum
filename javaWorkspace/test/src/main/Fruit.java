package main;

public class Fruit {

	    private String name; // 과일의 이름
	    private String color; // 과일의 색상

	    // 생성자
	    public Fruit(String name, String color) {
	        this.name = name;
	        this.color = color;
	    }

	    // 과일의 이름을 반환하는 메서드
	    public String getName() {
	        return name;
	    }

	    // 과일의 색상을 반환하는 메서드
	    public String getColor() {
	        return color;
	    }

	    // 과일의 정보를 문자열로 반환하는 메서드
	    @Override
	    public String toString() {
	        return "과일: " + name + ", 색상: " + color;
	    }
	}


