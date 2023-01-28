# Stream

## 1. 로그


#### cf. 직렬화 이용한 로그.

1. 배열  
    - 인풋 : MISSISSIPI
    - 아웃풋 : [M, I, S, S, I, S, S, I, P, I]
            
        ```java
      String[] strArr = input.split("");
      System.out.println("strArr = Mississipi"+Arrays.toString(strArr));
      IstrArr = [M, I, S, S, I, S, S, I, P, I] 
    
2. Stream 
   http://www.tcpschool.com/java/java_stream_creation

2-2. 검증 // for(String a : input.split(" ")){ // System.out.println("a = "+a); // } // // Arrays.stream(input.split(""))
// // String[] -> Int[]
// .forEach(System.out::println); // // Arrays.stream(input.split(""))
// // String[] -> Int[]
// .mapToInt(Integer::parseInt)
// .forEach(System.out::println);

### 형변환

3. 인티저 mapToInt
   https://zetawiki.com/wiki/%EC%9E%90%EB%B0%94_String_%EB%B0%B0%EC%97%B4%EC%9D%84_int_%EB%B0%B0%EC%97%B4%EB%A1%9C_%EB%B3%80%ED%99%98

https://www.techiedelight.com/ko/convert-string-array-to-int-array-java/

- Stream 에노스와 스터디.



