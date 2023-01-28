# Stream

## 기본 컨셉
  
  cf. https://url.kr/l71hka
- 새로 알게 된 내용 
  - stream과 함꼐 쓰는 데이터소스는 8가지이다.
  - 컬렉센, 배열, 매개변수 ( 가변, 지정된 범위의 연속된 정수, 특정 타입의 난수들, 람다표현식 ), 파일, 빈스트림
  - 스트림의 본질 chapter1 탄생일화로 보는 본질 습득. 
    - 스트림의 좋은점을 알았다.
  - 스트림은 3구조로 나뉘어진다. (생성/중계 연산/최종)
    - 생성이 그 8가지 데이터 소스이다. 
    - 중계에서는
      
      스트림을 스트림으로 받아 처리하여 지연을 늦추거나 연속적으로 연결하여 재사용이 가능합니다. 
  
      - 스트림API 에서 지원하는 5가지 대표적인 중계연산이 있습니다. 
  
        1. 스트림 필터링 : filter(), distinct()
   
        2. 스트림 변환 : map(), flatMap()
           
        3. 스트림 제한 : limit(), skip()
        
        4. 스트림 정렬 : sorted()
        
        5. 스트림 연산 결과 확인 : peek()
    - 최종에서는 

      각 요소를 소모하여 결과를 표시

      이렇게 최종 연산 시에 모든 요소를 소모한 해당 스트림은 더는 사용할 수 없게 됩니다.
  
      - 스트림 API 에서 지원하는 7가지 대표적인 최종연산이 있습니다. 
  
        1. 요소의 출력 : forEach()
        
        2. 요소의 소모 : reduce()
        
        3. 요소의 검색 : findFirst(), findAny()
        
        4. 요소의 검사 : anyMatch(), allMatch(), noneMatch()
        
        5. 요소의 통계 : count(), min(), max()
        
        6. 요소의 연산 : sum(), average()
        
        7. 요소의 수집 : collect()
          -> 이 외에도 사용자가 직접 Collector 인터페이스를 구현하여 자신만의 수집 방법을 정의할 수도 있습니다. 스트림 요소의 수집 용도별 사용할 수 있는 Collectors 메소드는 다음과
           같습니다.
           
            1. 스트림을 배열이나 컬렉션으로 변환 : toArray(), toCollection(), toList(), toSet(), toMap()
            
            2. 요소의 통계와 연산 메소드와 같은 동작을 수행 : counting(), maxBy(), minBy(), summingInt(), averagingInt() 등
            
            3. 요소의 소모와 같은 동작을 수행 : reducing(), joining()
            
            4. 요소의 그룹화와 분할 : groupingBy(), partitioningBy()
  

  - chapter1. 스트림의 거시관점(역사측면)에서 본질. 
    
    - 앞서.. 
    
      Java SE 8부터 추가된 스트림 API는 앞서 입력과 출력 수업에서 살펴본 스트림과는 전혀 다른 개념입니다. 
      
      데이터를 관리 관점에서 고민하여 나온 것들이다. 

    - as-is 자바에서 데이터 관리 방식 (collection)
    
      자바에서는 "많은 양의 데이터"를 "저장"하기 위해서 배열이나 컬렉션을 사용합니다.
      
      이렇게 저장된 데이터에 접근하기 위해서는 반복문이나 반복자(iterator)를 사용하여 매번 새로운 코드를 작성해야 합니다.

    - as-is 한계와 기대점 
    
      하지만 이렇게 작성된 코드는 길이가 너무 길고 가독성도 떨어지며, 코드의 재사용이 거의 불가능합니다.
    
    즉, 데이터베이스의 쿼리와 같이 정형화된 처리 패턴을 가지지 못했기에 데이터마다 다른 방법으로 접근해야만 했습니다.

    - to-be 자바에서 데이터 관리방식 (stream) 
    
      이러한 문제점을 극복하기 위해서 Java SE 8부터 스트림(stream) API를 도입합니다.
      
      스트림 API는 데이터를 추상화하여 다루므로, 다양한 방식으로 저장된 데이터를 읽고 쓰기 위한 공통된 방법을 제공합니다.

      따라서 스트림 API를 이용하면 배열이나 컬렉션뿐만 아니라 파일에 저장된 데이터도 모두 같은 방법으로 다룰 수 있게 됩니다.
  





  cf. https://c11.kr/1a2rj
- 새로 알게 된 내용
  - 컬렉션은 객체의 "구조"를 조작하고 저장할 수 있는구이다. ex. Collection 인터페이스가 있고, 그 하위 List, set, Queue가 있다. 
  - 제너릭은 컬렉션에서 "특정 type"을 지정할 수 있다. ex Map<String,String>
  - stream 데이터소스라 함은 자바에서 제공하는 크게 8가지 데이터 뿌리를 말한다.  
    - 컽렉션 (+제너릭) Ex. List, set, queue
    - 배열 Ex. String[]
    - Map 
  

  cf. https://jenkov.com/tutorials/java-collections/collection.html
  cf. https://www.javatpoint.com/collections-in-java

  cf. https://uchupura.tistory.com/108
  [JAVA] Streams를 이용한 Map Collection 사용 방법

- 8가지 데이터 소스에서 stream을 생성할 수 있습니다.


