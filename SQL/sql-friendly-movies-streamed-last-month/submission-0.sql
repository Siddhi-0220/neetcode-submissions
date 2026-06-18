-- Write your query below
select Distinct(title) as title from content
join tv_program on 
content.content_id = tv_program.content_id
where content.kids_content = 'Y' and 
tv_program.program_date >= '2020-06-01 00.00' 
and tv_program.program_date <= '2020-06-30 00.00';
