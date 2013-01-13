package com.xbw.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.xbw.anyclass.User;

public class ReflectTest {

	public static void main(String[] args) {

		Class clazz = User.class;
		// field, the clazz's attribute.
		Field[] fs = clazz.getDeclaredFields();
		for (Field field : fs) {
			System.out.println(field.getName() + "\t" + field.getType());
		}
		System.out.println();
		Method[] ms = clazz.getDeclaredMethods();
		for (Method method : ms) {
			System.out
					.println(method.getName() + "\t" + method.getReturnType());
		}
	}
}
