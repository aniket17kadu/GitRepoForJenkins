//package hooks;
//
//import io.cucumber.java.After;
//import io.cucumber.java.AfterAll;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeAll;
//import io.cucumber.java.BeforeStep;
//
//public class MyHooks {
//	
//	
//	@Before(value = "@Aniket", order =2)
//	public void beforehook () {
//		System.out.println("Before hook is running");
//	}
//	
//	@After(value= "@Aniket", order=2)
//	public void afterhook() {
//		System.out.println("after hook is running");
//	}
//	
//	@Before (value = "@Aniket", order=1)
//	public void beforehook_2() {
//		System.out.println("Before hook 2 is running");
//	}
//	
//	@After ("@Aniket")
//	public void afterhook_2() {
//		System.out.println("after hook 2 is running");
//	}
//	
//	@BeforeStep
//	public void beforeStep () {
//		System.out.println("Beforestep hook is running");
//	}
//	
//	@AfterStep
//	public void afterStep() {
//		System.out.println("afterstep hook is running");
//	}
//	
//	@BeforeAll
//	public static void beforeAll () {
//		System.out.println("Befor ALL hook is running");
//	}
//	
//	@AfterAll
//	public static void afterAll () {
//		System.out.println("after ALL hook is running");
//	}
//
//
//}
