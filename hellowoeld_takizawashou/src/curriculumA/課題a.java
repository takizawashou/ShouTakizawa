package curriculumA;

public class 課題a {
  public static void main(String[] args) { 
        byte byteVar = 0 ;
        byteVar = 10 ;
        short shortVar = 0 ;
        shortVar = 100 ;
        int intVar = 0 ;
        intVar = 1000 ;
        long longVar = 0L ;
        longVar = 10000L ;
        float floatVar = 0.0f ;
        floatVar = 9.5f ;
        double doubleVar = 0.0 ;
        doubleVar = 10.5 ;
        char charVar = '\u0000' ;
        charVar = 'a' ;
        String stringVar = "なし" ;
        stringVar = null ;
        boolean booleanVar = false ;
        booleanVar = true ;
        
        System.out.println(byteVar) ;
        System.out.println(shortVar) ;
        System.out.println(intVar) ;
        System.out.println(longVar) ;
        System.out.println(floatVar) ;
        System.out.println(doubleVar) ;
        System.out.println(charVar) ;
        System.out.println(stringVar) ;
        System.out.println(booleanVar) ;
        System.out.println(byteVar + shortVar + intVar + longVar + floatVar + doubleVar) ;
        System.out.println(byteVar * shortVar * intVar * longVar) ;
        System.out.println(doubleVar / shortVar) ;
        System.out.println(byteVar - shortVar) ;
        
        int num=20 ;
        int num1=23 ;
        System.out.println("ハローJAVA"+(num+num1)) ;
        
        String name ;
        name = "山田太郎" ;
        int age ;
        age = 18 ;
        float height ;
        height = 170.5f ;
        float weight ;
        weight = 62.2f ;
        String favoriteFood ;
        favoriteFood = "寿司" ;
        
        System.out.println("初めまして" + name + "です") ;
        System.out.println("年齢は" + age + "歳です") ;
        System.out.println("身長は" + height + "cmです") ;
        System.out.println("体重は" + weight + "kgです") ;
        System.out.println("好きな食べ物は" + favoriteFood + "です") ;
        System.out.println("BMIは" + (weight/height/height*10000) + "です") ;
        
        name = "鈴木一郎" ;
        age = 24 ;
        height = 168.5f ;
        weight = 64.2f ;
        favoriteFood = "オムライス" ;
        float bmi = 0.0f ;
        bmi = weight/height/height*10000f ;
        
        System.out.println("初めまして" + name + "です") ;
        System.out.println("年齢は" + age + "歳です") ;
        System.out.println("身長は" + height + "cmです") ;
        System.out.println("体重は" + weight + "kgです") ;
        System.out.println("好きな食べ物は" + favoriteFood + "です") ;
        System.out.println("BMIは" + bmi + "です") ;
        
        name = "鈴木一郎" ;
        age = 48 ;
        height = 337.0f ;
        weight = 128.4f ;
        favoriteFood = "オムライス" ;
        bmi = weight/height/height*10000f ;
        
        System.out.println("初めまして" + name + "です") ;
        System.out.println("年齢は" + age + "歳です") ;
        System.out.println("身長は" + height + "cmです") ;
        System.out.println("体重は" + weight + "kgです") ;
        System.out.println("好きな食べ物は" + favoriteFood + "です") ;
        System.out.println("BMIは" + bmi + "です") ;
        
        boolean result ;
        result = age >= 25 ;
        System.out.println(result) ;
        
        age = 24 ;
        height = 168.5f ;
        weight = 64.2f ;
        String ageStr = Integer.toString(age) ;
        String heightStr = Float.toString(height) ;
        String weightStr = Float.toString(weight) ;
        System.out.println("年齢は" + age + "歳です") ;
        System.out.println("身長は" + height + "cmです") ;
        System.out.println("体重は" + weightStr + "kgです") ;
        
        int age2 = Integer.parseInt(ageStr);
        float height2 = Float.parseFloat(heightStr);
        
        System.out.println("年齢は" + age2 + "歳です") ;
        System.out.println("身長は" + height2 + "cmです") ;
        
        boolean result2 ;
        result2 = (age2 >= 25) || (height2 >= 160);
        System.out.println(result2);
  }
}
