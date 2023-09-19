select warehouse_id, warehouse_name, address, coalesce(FREEZER_YN, 'N') as FREEZER_YN
from food_warehouse
where address like '경기도%'
order by warehouse_id;