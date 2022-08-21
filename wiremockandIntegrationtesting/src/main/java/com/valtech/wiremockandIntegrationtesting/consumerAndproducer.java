package com.valtech.wiremockandIntegrationtesting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class consumerAndproducer {

	public static void main(String[] args) {
		consumer s = (a) -> {
			int aa = a;
			int c = aa + a;
			System.out.println(c);
		};
		s.consumerKind(10);
		Consumer<String> sss = x -> x.charAt(0);

		consumer consumers = (ssss) -> {
			System.out.println("ss");
		};
		producer producers = () -> {
			return 10;
		};
		producers.producerKind();

		consumers.consumerKind(10);

		predicate pre = (a) -> true;

		List<predicate> e = new ArrayList();
		predicate pop = pre;
		e.add(pre);
		e.add(pop);
		List<predicate> p = e.stream().filter(x -> x.aa(0)).collect(Collectors.toList());
		System.out.println(p);
		
		calculate calal=(x,y)-> { return x+y;};
		List<calculate> lis=new ArrayList();
		lis.add(calal);
		lis.stream().map(x->x.add(0, 0));
	}

}

interface producer {
	public int producerKind();
}

@FunctionalInterface
interface consumer {
	public void consumerKind(int a);
}

@FunctionalInterface
interface ss {
	public int aa();

}

@FunctionalInterface
interface predicate {
	public boolean aa(int a);
}

@FunctionalInterface
interface calculate {
	public int add(int a, int b);
}