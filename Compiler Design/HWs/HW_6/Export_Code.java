// module-info.java
module com.mycompany.myapp {
   requires java.base;
   exports com.mycompany.myapp;
}

// src/com.mycompany.myapp/MyClass.java
package com.mycompany.myapp;

public class MyClass {
   public static void sayHello() {
       System.out.println("Hello from MyClass!");
   }
}

// src/com.myothercompany.myotherapp/MyOtherClass.java
module com.myothercompany.myotherapp {
   requires com.mycompany.myapp;
}

import com.mycompany.myapp.MyClass;

public class MyOtherClass {
   public static void main(String[] args) {
       MyClass.sayHello();
   }
}
