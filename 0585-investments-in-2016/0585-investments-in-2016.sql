select round(sum(tiv_2016),2) as tiv_2016
from Insurance t1
where exists (select 1 from Insurance t2 where t1.pid != t2.pid and t1.tiv_2015 = t2.tiv_2015)
and not exists (select 1 from Insurance t2 where t1.pid != t2.pid and t1.lat = t2.lat and t1.lon = t2.lon);