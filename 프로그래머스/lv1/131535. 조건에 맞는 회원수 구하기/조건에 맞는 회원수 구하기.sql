select count(user_id) as users
from user_info
where year(joined) = 2021 and age between 20 and 29;