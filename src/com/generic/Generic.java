package com.generic;

public class Generic {

	public static void main(String[] args) {
		//用泛型类声明对象时，必须指定类中使用的泛型的具体类名
		//创建实例对象时，用具体的类名代替
		Chorous2<Singer2, MusicalInstruments2> model = new Chorous2<Singer2, MusicalInstruments2>();
		model.makeChorus(new Singer2(), new MusicalInstruments2());
	}

}
