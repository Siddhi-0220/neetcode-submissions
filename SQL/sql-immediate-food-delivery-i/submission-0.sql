-- Write your query below
select
ROUND(count(CASE WHEN order_date = customer_pref_delivery_date THEN 1 END) * 100.0/count(*),2)
AS immediate_percentage
FROM delivery;