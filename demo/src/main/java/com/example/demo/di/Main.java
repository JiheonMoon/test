//package com.example.demo.di;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//
//import com.google.common.reflect.ClassPath;
//
//
//
//@Component class Car{};
//@Component class SportCar extends Car{};
//@Component class Truck extends Car{};
//@Component class Engine{}
//
//class AppContext{
//	Map map;
//	
//	public AppContext() {
//		map = new HashMap();
//		doComponentScan();
//	}
//	
//	private void doComponentScan() {
//		try {
//			//1.패키지 내의 클래스 목록을 가져온다
//			//2.반복문으로 클래스를 하났기 읽어서 @Component가 붙어있는지 확인
//			//3.@Component가 붙어있으면 객체를 생성해서 Map에 저장
//			
//			//클래스로더는 JVM에서 클래스를 동적으로 로드하고, 애플리케이션이 사용할수 있도록 메모리에 적재하는 역할을 한다.
//			ClassLoader classLoader = AppContext.class.getClassLoader();
//			
//			//ClassPath는 구아바에서 제공하는 기능으로, 클래스 경로 상의 모든 클래스를 탐색하고 사용할수 있게 해준다
//			ClassPath classPath = ClassPath.from(classLoader);
//			
//			//지정한 패키지 내의 최상위 클래스들을 가져옴
//			//이 메서드는 지정된 패키지 내에서 상위 레벨 크래스를 탐색하고, 그 결과로 객체들을 집합을 반환
//			Set<ClassPath.ClassInfo> set = classPath.getTopLevelClasses("com.example.demo.di");
//			
//			//위에서 얻은 클래스 정보를 반복으로 처리한다
//			//각 ClassPath.ClassInfo 객체는 특정 클래스에 대한 정보를 나타냄
//			for(ClassPath.ClassInfo classInfo: set) {
//				Class clazz = classInfo.load();
//				
//				Component component = (Component)clazz.getAnnotation(Component.class);
//				
//				if(component != null) {
//					String id = StringUtils.uncapitalize(classInfo.getSimpleName());
//					map.put(id, clazz.newInstance());
//				}
//			}
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
//	
//	Object getBean(String key) {
//		return map.get(key);
//	}
//	
//	Object getBean(Class clazz) {
//		for(Object obj : map.values()) {
//			if(clazz.isInstance(obj)) {
//				return obj;
//			}
//		}
//		return null;
//	}
//}
//public class Main {
//	public static void main(String[] args)throws Exception {
//		AppContext ac = new AppContext();
//		
//		
//		Car car = (Car)ac.getBean("car");
//		System.out.println("car= " + car);
//		
//		Engine engine = (Engine)ac.getBean("engine");
//		System.out.println("engine= " + engine);
//		
//		Truck truck = (Truck)ac.getBean(Truck.class);
//		System.out.println("truck= " + truck);
//	}
//}
