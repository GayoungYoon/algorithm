n = int(input())

##list(input().split())과 결과 동일
plans = (input().split())

x, y =1,1 ##여행자의 현재 좌표
nx, ny = 1,1 ##여행자가 이동할 좌표

## R, L, U, D 기준 좌표 증감
dx = [0, 0 , -1, 1] 
dy = [1, -1, 0 , 0]

##Plan to index를 변환을 위해 사전자료형 활용
plan_tb = dict([('R',0), ('L',1), ('U',2), ('D',3)])

for plan in plans:
   #plan에 따른 다음 좌표 산출
    nx = x + dx[plan_tb[plan]] 
    ny = y + dy[plan_tb[plan]]
  
    #해당 좌표가 유효하면 현재 좌표 이동
    if(1<=nx<=n and 1<=ny<=n) :
      x = nx
      y = ny
    ##유효하지 않으면 이동할 좌표 - 현재좌표로 초기화
    else :
      nx = x
      ny = y

print(x, y)

