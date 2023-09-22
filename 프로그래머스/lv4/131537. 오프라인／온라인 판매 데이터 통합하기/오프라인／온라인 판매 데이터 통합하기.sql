select 
    date_format(sales_date, '%Y-%m-%d') as sales_date,
    product_id,
    user_id,
    sales_amount
from online_sale
where year(sales_date) = 2022 and month(sales_date) = 3
 
union all
 
select
    date_format(sales_date, '%Y-%m-%d') as sales_date,
    product_id,
    Null as user_id,
    sales_amount
 from offline_sale
 where year(sales_date) = 2022 and month(sales_date) = 3
 
 order by sales_date, product_id, user_id;