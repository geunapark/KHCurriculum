package kh;

public class KhArrayList {

	private int capacity = 5;
	private Object[] dataArr = new Object[capacity];
	private int cnt = 0;

	public void add(Object data) {
		checkCnt();
		dataArr[cnt++] = data;

	}

	public void add(int idx, Object data) {

		if (idx < 0 || idx > cnt) {
			System.out.println("잘못된 인덱스 값 입니다");
			return;
		}

		checkCnt();

		for (int i = cnt; i > idx; i--) { //뒤로 한칸씩 밀어주는거임
			dataArr[i] = dataArr[i - 1];
		}
		dataArr[idx] = data;
		cnt++;

	}// 메소드
		// dataArr[idx] = data;

	private void checkCnt() {

		if (capacity == cnt) {
			increatArray();
		}
	}

	public Object get(int idx) {

		return dataArr[idx];

	}// 메소드

	private void increatArray() {
		capacity *= 2;
		Object[] newArr = new Object[capacity];

		for (int i = 0; i < cnt; i++) {
			newArr[i] = dataArr[i];
		}

		dataArr = newArr;

	}

	public int size() {
		return cnt;
	}

	public void clear() {
		for (int i = 0; i < cnt; i++) {
			dataArr[i] = null;

		}
		cnt = 0;

	}

	public void remove(int idx) {
		dataArr[idx] = null;

		for (int i = idx; i < cnt - 1; i++) {
			dataArr[i] = dataArr[i + 1];
		}
		cnt--;

	}

}