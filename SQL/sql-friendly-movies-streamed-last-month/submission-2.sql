-- Write your query below
select Distinct(title) as title from content
join tv_program on 
content.content_id = tv_program.content_id
where content.kids_content = 'Y'and content.content_type = 'Movies'
and 
tv_program.program_date like '2020-06%';
