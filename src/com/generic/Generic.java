package com.generic;

public class Generic {

	public static void main(String[] args) {
		//�÷�������������ʱ������ָ������ʹ�õķ��͵ľ�������
		//����ʵ������ʱ���þ������������
		Chorous2<Singer2, MusicalInstruments2> model = new Chorous2<Singer2, MusicalInstruments2>();
		model.makeChorus(new Singer2(), new MusicalInstruments2());
	}

}
