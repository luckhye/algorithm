# 자주 사용하는 task

## 1. 로그

#### 데이터 집합을 검증하여, 빠르기와 정확도를 높인다. 

<br/>

#### 1) 배열
##### collection 의 상속함수로 관련 메소드를 사용할 수 있다. 

   - 직렬화 출력
   ```java
  String[] strArr = input.split(""); 
  
  System.out.println("strArr = Mississipi"+Arrays.toString(strArr)); 
  
  IstrArr = [M, I, S, S, I, S, S, I, P, I]
  ```

   - for문 출력
   ```java
     for(String a : input.split(" ")){  
  
         System.out.println("a = "+a);
  
   } 
   ```
  <br/>


####  2) Stream
- 기본 출력 

 ```java
  .. .forEach(System.out::println);
  ```


## 2. 형변환

3. 인티저 mapToInt
   
   

- String -> Int 
  
  cf. https://url.kr/het4op
   ```java
  .. .mapToInt(Integer::parseInt)
   ```

- String[] -> int[] 
  
  cf. https://url.kr/qzlkyo
   ```java
  .. .mapToInt(Integer::parseInt)
   ```


     



