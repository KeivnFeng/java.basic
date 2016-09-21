package org.basic.loader;

public class TestLoader {

	public static void main(String[] args) {
		ClassLoader clApp = TestLoader.class.getClassLoader();
		System.out.println(clApp);
		ClassLoader clExt = clApp.getParent();
		System.out.println(clExt);
		ClassLoader clBoot = clExt.getParent();
		System.out.println(clBoot);

	}

}
