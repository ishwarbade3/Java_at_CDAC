package cdac_day10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class ReflectDemo {
	public static void main(String[] args)throws  ClassNotFoundException {
		Class cls = Class.forName("cdac_day10.Employee");
		System.out.println(cls);
		
		Class supercls = cls.getSuperclass();
		System.out.println(supercls);
		
		Method mtd[]= cls.getMethods();
		System.out.println("-------------------------Method Are As Follow !!!!");
		for(Method m:mtd) {
			System.out.println(m);
		}
		System.out.println("-------------------------Field Is As Follow !!!!!!!!!!!!!!!!!!!!!!!!!");
		Field fld[]= cls.getFields();
		for(Field f :fld) {
			System.out.println(f);
		}
		System.out.println("-------------------------------Constructor is As Follow!!!!!!!!!!!!!!!!!!!!!!!!!!");
		Constructor contr[]= cls.getConstructors();
		for(Constructor c:contr ) {
			System.out.println(c);
		}
		
		//System.out.println("===================Interface is As Follow!!!!!!!!!!!!!!!!!!"); we cannot check interface
		
		
		
		
	}

}
