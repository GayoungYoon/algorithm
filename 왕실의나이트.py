## input 형식 a3 = 문자+숫자
## input 함수로만 입력받고
crdnt = input()

##문자열처럼 index로 접근
row = int(crdnt[1]) 
##문자열을 ascii 코드값으로 돌려주는 ord함수 사용
column = int(ord(crdnt[0])) - int(ord('a')) + 1

dx = [ 2, 1 ] ##x좌표의 이동 가능 좌표
dy = [ 1, 2 ] ##y = abs(3-x)
drc = [ 1, -1] ##방향 좌표

result=0

nx_row , nx_column = row, column ##이동 후의 좌표 위치

for i in range(0,2): ##x를 2칸 보낼지 y를 2칸 보낼지 select 
  for j in range(0,2): ## d[]= 2 인 변수의 vector 
    nx_row = row + int(dx[i])*int(drc[j]) ##x좌표의 방향 select 후 현재  좌표에 계산
    for k in range(0,2): ## d[]=1 인 변수의 vector
      nx_column = column+ int(dy[i])*int(drc[k]) ##y좌표의 방향 select 후 현재 좌표에 계산
      
      if(1<=nx_row<=8 and 1<=nx_column<=8) : ##유효성 검증
        result += 1 
    
    nx_row , nx_column = row, column ##계산 후 좌표 현재 좌표로 초기화

print(result)