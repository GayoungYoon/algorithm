n = int(input())
count=0
p = 0

##초단위, 10초단위, 분단위, 10분단위, 시간
s, ts, m, tm, h, th = 0,0,0,0,0,0

if(n >=10) :
  p=2
else:
  p=1


for th in range(0,p):
  for hour in range(0,n+1) :
    for tmin in range(0,6):
      for minn in range(0,10):
        for tsec in range(0,6):
            for sec in range(0,10):
              if('3' in str(th) +str(hour)+str(tmin)+str(minn)+str(tsec)+str(sec)) :
                count +=1
                ##print(str(th)+str(hour)+str(tmin)+str(minn)+str(tsec)+str(sec))
print(count)