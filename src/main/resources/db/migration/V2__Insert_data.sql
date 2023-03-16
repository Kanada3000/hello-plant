

INSERT INTO role(id, name) VALUES (1, 'admin');
INSERT INTO role(id, name) VALUES (2, 'user');

INSERT INTO usr(id, role_id, name, login, password) VALUES (1, 1, 'ADMIN', 'admin', 'admin');
INSERT INTO usr(id, role_id, name, login, password) VALUES (2, 2, 'USER', 'user', 'user');

BEGIN;
INSERT INTO plant(id, name) VALUES (1, 'Хлорофітум');
INSERT INTO plant_description(id, watering, lighting, temperature, spraying, transplant, fertilizer, description) 
VALUES (1, 'Двічі на день', 'Багато сонця', 'Помірна', 'Раз на тиждень', 'Раз на рік', 'Раз на 2 місяці', 'Якийсь опис');
COMMIT;

BEGIN;
INSERT INTO plant(id, name) VALUES (2, 'Каламондін');
INSERT INTO plant_description(id, watering, lighting, temperature, spraying, transplant, fertilizer, description) 
VALUES (2, 'Тричі на день', 'Багато сонця', 'Тепла', 'Два рази на тиждень', 'Раз на два роки', 'Раз на 2 місяці', 'Якийсь опис2');
COMMIT;
