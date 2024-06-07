CREATE OR REPLACE FUNCTION get_id_by_name(nome TEXT) RETURNS INTEGER
language plpgsql
as $$
declare result_id integer;
begin
	 select id into result_id from ingredient where ingredient."name" = nome;
	 return result_id;
end;
$$;

CREATE OR REPLACE FUNCTION get_mealid_by_name(nome TEXT) RETURNS INTEGER
language plpgsql
as $$
declare result_id integer;
begin
	 select id into result_id from meal where meal."name"  = nome;
	 return result_id;
end;
$$;
