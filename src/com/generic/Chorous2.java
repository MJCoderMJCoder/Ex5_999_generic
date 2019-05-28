package com.generic;
/*
 * 泛型类声明：
 * class 泛型类名<泛型列表> {
 * 		类体
 * }
 */

/*泛型类中的泛型对象只能调用Objct类中的方法；故重写了Object类的toString()方法*/
class Chorous2<E, F> implements Computer<E, F> {
	public void makeChorus(E x, F y) {
		x.toString();
		y.toString();
	}
}
