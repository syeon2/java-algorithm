select temp.flavor
from (select a.flavor, sum(a.total_order + b.total_order) as orders
        from first_half a
        join july b
            on a.flavor = b.flavor
        group by a.flavor) temp
order by temp.orders desc
limit 3;