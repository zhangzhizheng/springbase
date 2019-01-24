package cn.spring2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的作用范围
 * @author Administrator
 *
 */
public class SpringTest3 {
	@Test
	public void demo1(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		Customer customer1=(Customer) applicationContext.getBean("customer");
		//通过打印对象的地址结果，发现一样，说明实例化一次
		System.out.println(customer1);
		System.out.println("=======================");
		Customer customer2=(Customer) applicationContext.getBean("customer");
		System.out.println(customer2);
	}
}
