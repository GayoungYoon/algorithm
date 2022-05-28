# algorithm 공부

이전
- 이것이 코딩테스트다
- 예제 풀이

2021.09.13 
- [정규식정리](https://github.com/GayoungYoon/algorithm/blob/master/%EC%A0%95%EA%B7%9C%EC%8B%9D/%EC%A0%95%EA%B7%9C%EC%8B%9D.md)
- [문자열 내 마음대로 정렬하기](https://github.com/GayoungYoon/algorithm/blob/master/%EC%A0%95%EB%A0%AC/%EB%AC%B8%EC%9E%90%EC%97%B4%20%EB%82%B4%20%EB%A7%88%EC%9D%8C%EB%8C%80%EB%A1%9C%20%EC%A0%95%EB%A0%AC%ED%95%98%EA%B8%B0_comparator.java)
  -Comparator와 compare overriding
- [신규아이디 추천](https://github.com/GayoungYoon/algorithm/blob/master/%EC%A0%95%EA%B7%9C%EC%8B%9D/%EC%8B%A0%EA%B7%9C%EC%95%84%EC%9D%B4%EB%94%94%EC%B6%94%EC%B2%9C_%EC%A0%95%EA%B7%9C%EC%8B%9D%ED%92%80%EC%9D%B4.java)
  -정규식과 replaceAll
- [문자숫자열과 영단어](https://github.com/GayoungYoon/algorithm/blob/master/%EB%AC%B8%EC%9E%90%EC%97%B4/%EB%AC%B8%EC%9E%90%EC%88%AB%EC%9E%90%EC%97%B4%EA%B3%BC%EC%98%81%EB%8B%A8%EC%96%B4_replaceAll%EC%9D%84%20%EC%9D%B4%EC%9A%A9%ED%95%9C%20%ED%92%80%EC%9D%B4.java)


2021.12.22
- leetcode 문제 sol
- [JewelsAndStones](https://github.com/GayoungYoon/algorithm/blob/master/%EB%AC%B8%EC%9E%90%EC%97%B4/JewelsAndStones.java) 
-두개의 String이 주어졌을 때, 하나의 String안에 distinctive한 char 값이 다른 String 안에 포함되었는지를 판별하는 문제  
-String을 toCharArray()로 두개의 String을 Character배열로 전환  
-containg함수를 쓰기 위해 Character형 HashSet 사용

- [UniqueEmail](https://github.com/GayoungYoon/algorithm/blob/master/%EB%AC%B8%EC%9E%90%EC%97%B4/UniqueEmail.java) 
-@값을 기준으로 로컬네임과 도메인네임으로 String 분리 후 각각의 규칙에 맞게 String 가공  
-replaceAll과 Split 함수 사용

- [plusOne](https://github.com/GayoungYoon/algorithm/blob/master/%EB%AC%B8%EC%9E%90%EC%97%B4/plusOne.java)  
-문자열 함수를 사용했다기 보다 indexing하는게 더 어려웠던 문제 > flag 같은 배열을 하나 더 추가해서 solve


2022.03.05
- **** 실수 list *****
- [bfs] 큐 안에서 인덱스는 항상 remove() 해온거 기준으로 하기. 명심 또 명심.
- [dfs] 최대값을 가져와야 하는 경우 return 부분에서 항상 비교 후에 최대값 return! 


2022.03.06
- [네트워크](https://github.com/GayoungYoon/algorithm/blob/master/DFS/%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC.java)
- notice! bfs/네트워크.java 에서는 입력값이 2차원이지만 양방향그래프이기떄문에 체크를 1차원 배열로 하였다. 한번 더 보면 좋을 듯하다.

2022.03.12
- [네트워크](https://github.com/GayoungYoon/algorithm/blob/master/BFS/%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC.java)
- 네트워크 문제를 dfs로 풀어보았다. 탐색의 시작은 항상 직전 탐색의 마지막 지점에서 이루어져야함을 잊지 말자

2022.03.16
- [단어변환](https://github.com/GayoungYoon/algorithm/blob/master/DFS/%EB%8B%A8%EC%96%B4%EB%B3%80%ED%99%98.java)
- 단어 변환. 반성한다.
반성할점 1. 문제 해석을 잘못했다. 주어진 단어 목록에서 무조건 순차적으로 탐색을 해야되는 줄 알았다.
반성할점 2. 그래서 그 조합문제처럼 경우의 수에 따라 dfs 탐색을 해버렸다. 
 - 바꿀수 있어서 바꾼 케이스
 - 바꿀수 있는데 안바꾼 케이스
 - 바꿀수 없는 케이스
반성할점 3. 근데 그게 아니라 단어 목록을 차례대로 순회하면서 방문한 단어를 시작으로 매번 단어 목록을 재탐색하는거였다.
          그래서 방문처리가 필요한거였음. 그리고 순회가 끝나면 방문처리를 지워줘야 하는 것도 최소값을 찾는거기 떄문에 방문처리배열을 재사용해야되기 때문

결론. 문제가 막막하다면 아래와 같은 체크 리스트를 생각해보자
1. 탐색에 필요한 기준 데이터가 잘 설정 되었는가
2. 동일 대상에 대해 여러번 탐색이 필요한가 ( 최소값/ 최대값 ) - 네트워크의 경우는 여러번 탐색하지 않아도 됐다.
3. 방문처리를 제때 잘 해주었는가


언젠가
- [ValidParentheses](https://github.com/GayoungYoon/algorithm/blob/master/Stack/ValidParentheses.java)
- stack뿐 아니라 s.toCharArray() , hashmap의 get put 등 사용

2022.03.17
- [타겟넘버](https://github.com/GayoungYoon/algorithm/blob/master/DFS/%ED%83%80%EC%BC%93%EB%84%98%EB%B2%84.java)
- [타켓넘버2](https://github.com/GayoungYoon/algorithm/blob/master/DFS/%ED%83%80%EA%B2%9F%EB%84%98%EB%B2%842.java)
1. 타겟 넘버를 다시 구현해보았다.
2. dfs를 구현할 때는 아래것을을 체크해본다.
- 대상그래프
- 현재값 / 현재 카운트
- 종료조건 값/ 종료조건 카운트
: 종료조건 카운트는 0부터 시작해서 그래프길이 -1 까지 다 순회하고 나서 그래프 길이와 같아졌을 때 값을 비교한다.

2022.05.01
- [전화번호목록](https://github.com/GayoungYoon/algorithm/blob/master/Hash/%EC%A0%84%ED%99%94%EB%B2%88%ED%98%B8%EB%AA%A9%EB%A1%9D.java)
- 전화번호 목록 문제 : Hash를 사용하여 한 문자열이 다른 문자열의 접두어가 될 수 있는지 파악
- 똑같은 이중 포문이지만 문자를 equals로 비교할 때보다, hash에 담아놓고 substring을 계속 hash와 체크하는 것이 더 효율적이었다.

2022.05.02
 - [위장]( https://github.com/GayoungYoon/algorithm/blob/master/Hash/%EC%9C%84%EC%9E%A5.java )
- hash를 사용할 땐 get 이후 null인지 체크하지 말고 contains 함수를 쓰자
- hash를 iterationing 하고 싶을 떈 ( String key : map.keySet()){ ... } 을 사용

2022.05.28
 - [기능개발](https://github.com/GayoungYoon/algorithm/blob/master/Queue/%EA%B8%B0%EB%8A%A5%EA%B0%9C%EB%B0%9C.java)
 - 두가지 값을 비교할 땐, 기준값을 다시 바꿔주는 과정 / 마지막 값을 비교할 때 등을 잘 고려해야 함.
