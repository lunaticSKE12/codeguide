# codeguide


Tasks by Napong Dungduangsasitorn (5710546216)


### Encapsulation
Encapsulation means putting together all the variables (instance variables) and the methods into a single unit called Class. It also means hiding data and methods within an Object. Encapsulation provides the security that keeps data and methods safe from inadvertent changes. Programmers sometimes refer to encapsulation as using a “black box,” or a device that you can use without regard to the internal mechanisms. A programmer can access and use the methods and data contained in the black box but cannot change them. Below example shows Mobile class with properties, which can be set once while creating object using constructor arguments. Properties can be accessed using getXXX() methods which are having public access modifiers.

```
public class Mobile {     
    private String manufacturer;  
    private String operating_system;  
    public String model;  
    private int cost;  
    //Constructor to set properties/characteristics of object  
    Mobile(String manufacturer, String os,String model, int cost){  
        this.manufacturer = manufacturer;  
        this.operating_system=os;  
        this.model=model;  
        this.cost=cost;  
    }  
    //Method to get access Model property of Object  
    public String getModel(){  
        return this.model;  
    }  
    // We can add other method to get access to other properties  
}  
```

### Inheritance
An important feature of object-oriented programs is inheritance—the ability to create classes that share the attributes and methods of existing classes, but with more specific features. Inheritance is mainly used for code reusability. So you are making use of already written the classes and further extending on that. That why we discussed the code reusability the concept. In general one line definition, we can tell that deriving a new class from existing class, it’s called as Inheritance. You can look into the following example for inheritance concept. Here we have Mobile class extended by other specific class like Android and Blackberry.

```
public class Android extends Mobile{  
        //Constructor to set properties/characteristics of object  
        Android(String manufacturer, String os,String model, int cost){  
                super(manufacturer, os, model, cost);  
            }  
        //Method to get access Model property of Object  
        public String getModel(){  
            return "This is Android Mobile- " + model;  
        }  
}
```
```
public class Blackberry extends Mobile{  
    //Constructor to set properties/characteristics of object  
    Blackberry(String manufacturer, String os,String model, int cost){  
                    super(manufacturer, os, model, cost);  
                }  
    public String getModel(){  
        return "This is Blackberry-"+ model;  
    }  
}
```

### Static Polymorphism

The ability to execute different method implementations by altering the argument used with the method name is known as method overloading. In below program, we have three print methods each with different arguments. When you properly overload a method, you can call it providing different argument lists, and the appropriate version of the method executes.

```
class Overloadsample {  
    public void print(String s){  
        System.out.println("First Method with only String- "+ s);  
    }  
    public void print (int i){  
        System.out.println("Second Method with only int- "+ i);  
    }  
    public void print (String s, int i){  
        System.out.println("Third Method with both- "+ s + "--" + i);  
    }  
}  
public class PolymDemo {  
    public static void main(String[] args) {  
        Overloadsample obj = new Overloadsample();  
        obj.print(10);  
        obj.print("Amit");  
        obj.print("Hello", 100);  
    }  
}  
```

Out put:
```
Second Method with only int- 10
First Method with only String- Amit
Third Method with both- Hello--100
```

Reference : http://www.w3resource.com/java-tutorial/java-object-oriented-programming.php

### Exercise

