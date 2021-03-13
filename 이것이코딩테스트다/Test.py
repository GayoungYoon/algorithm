n = int(input())

##초단위, 10초단위, 분단위, 10분단위, 시간
s, ts, m, tm, h = 0,0,0,0,0


for hour in range(n) :
  for tmin in range(6):
    for min in range(9):
      for tsec in range(6):
        for sec in range(9):
          if ( sec==3 ) :
            s +=1
        if(tsec==3)
        ts +=1
      if(min==3)
      m +=1 
    if(tmin==3)
    tm +=1
  if(hour==3)
  h +=1 

print(h*tm*m*ts*s)