package com.example.demo.di3;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
//import 자동으로 안될 수 있
/////////////////////////////////////////////////
import org.springframework.stereotype.Component;
//////////////////////////////////////////////
import org.springframework.util.StringUtils;

import com.google.common.reflect.ClassPath;

@Component class Car{
	@Autowired
	Engine engine;
	@Autowired
	Door door;
	@Override
	public String toString() {
		return "Car [engine=" + engine + ", door=" + door + "]";
	}
	
	
};
@Component class SportCar extends Car{};
@Component class Truck extends Car{};
@Component class Engine {};
@Component class Door{};

class AppContext{
	Map map; //객체 저장소
	
	public AppContext() {
		map = new HashMap();
		doComponentScan();
		///////////////////
		doAutowired();
		///////////////////
	
		
	}
	//////////////////////////////////////////////////////////
	private void doAutowired() {
		//map에 저장된 객체의 객체변수중에 @Autowired가 붙어 있으면
		//객체변수의 타입에 맞는 객체를 찾아서 연결(객체의 주소를 객체변수에 저장)
		
		try {
		for(Object bean : map.values()) {//map의 value에 저장된것들 중에서
			
			//Field 클래스
			//클래스의 멤버에 대한 정보를 표현하고 조작할수 있게 해준다
			// 특정 클래스에 선언된 멤버 변수를 수정하는데 사용된다
			for(Field fld : bean.getClass().getDeclaredFields()) {
				if(fld.getAnnotation(Autowired.class)!=null) { //오토 와이어드가 붙어있는지 보고 붙어있으면 해당하는 타입을 찾아서 저
					fld.set(bean, getBean(fld.getType()));
				}
			}
		}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	//////////////////////////////////////////////////////////
	
	private void doComponentScan() {
		
		try {
		//1. 패키지내의 클래스 목록을 가져온다.
		//2. 반복문으로 클래스를 하나씩 읽어와서 @Component가 붙어있는지 확인
		//3. @Component가 붙어있으면 객체를 생성해서 map에 저장
		
		ClassLoader classLoader = AppContext.class.getClassLoader();
		ClassPath classPath = ClassPath.from(classLoader);
		
		Set<ClassPath.ClassInfo> set = classPath.getTopLevelClasses("com.example.demo.di");
		
		for(ClassPath.ClassInfo classInfo : set) {
			Class clazz = classInfo.load();
			Component component = (Component)clazz.getAnnotation(Component.class);
			if(component != null) {
				String id = StringUtils.uncapitalize(classInfo.getSimpleName());
				map.put(id, clazz.newInstance());
			}
		}
		} catch(Exception e) {
			
		}
		
	}
	
	Object getBean(String key) {
		return map.get(key);
	}
	
	Object getBean(Class clazz) {
		for(Object obj : map.values()) {
			if(clazz.isInstance(obj)) {
				return obj;
			}
		}
		return null;
	}
}

public class Main {
	
	public static void main(String[] args)throws Exception {
		AppContext ac = new AppContext();
		
		
		Car car = (Car)ac.getBean("car"); //byName으로 객체를 검색
		
		Engine engine = (Engine)ac.getBean("engine");
		
		
		Door door = (Door)ac.getBean(Door.class);
		
		
		//doAutowired메서드가 알아서 주입을 해준다.
		//car.engine=engine;
		//car.door = door;
		
		System.out.println("car= " + car);
		System.out.println("engine= " + engine);
		System.out.println("door= " + door);
		
		
	}
}