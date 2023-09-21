-- 코드를 입력하세요
SELECT a.animal_Id, a.name
from animal_ins a, animal_outs b
where a.animal_id = b.animal_id
order by datediff(b.datetime, a.datetime) desc
limit 2;