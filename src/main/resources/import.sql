INSERT INTO USERAPI(id_user, name, email, password, created, modified, last_login, token, is_active) VALUES('6e8b6014-2c70-478d-9bc1-e50deb22f46b' ,'Jhon Lizcano', 'jhon@lizcano.org', 'hunter1', CURRENT_DATE, CURRENT_DATE, CURRENT_DATE, 'eyJhbGciOiJub25lIn0.eyJuYW1lIjoiSnVhbiBSb2RyaWd1ZXoiLCJlbWFpbCI6Imp1YW5Acm9kcmlndWV6Lm9yZyIsInN1YiI6Ikp1YW4gUm9kcmlndWV6IiwianRpIjoiODU1YzI5MDctMGU1Zi00MzY2LWExNzktOGI1YmVmZWY4YzRkIiwiaWF0IjoxNjc3NjExMDY5LCJleHAiOjE2Nzc2MTE5Njl9.', 'true');
INSERT INTO USERAPI(id_user, name, email, password, created, modified, last_login, token, is_active) VALUES('ac975290-fbfa-4452-9507-0c98ffab8a3b' ,'Arledis Jaimes', 'arledis@jaimes.com', 'hunter2', CURRENT_DATE, CURRENT_DATE, CURRENT_DATE, 'eyJhbGciOiJub25lIn0.eyJuYW1lIjoiSnVhbiBSb2RyaWd1ZXoiLCJlbWFpbCI6Imp1YW5Acm9kcmlndWV6Lm9yZyIsInN1YiI6Ikp1YW4gUm9kcmlndWV6IiwianRpIjoiODU1YzI5MDctMGU1Zi00MzY2LWExNzktOGI1YmVmZWY4YzRkIiwiaWF0IjoxNjc3NjExMDY5LCJleHAiOjE2Nzc2MTE5Njl9.', 'true');
INSERT INTO USERAPI(id_user, name, email, password, created, modified, last_login, token, is_active) VALUES('f9f9547e-8a8a-4292-a1ab-5e3285e39678' ,'Karent Lizcano', 'karent@lizcano.co', 'hunter3', CURRENT_DATE, CURRENT_DATE, CURRENT_DATE, 'eyJhbGciOiJub25lIn0.eyJuYW1lIjoiSnVhbiBSb2RyaWd1ZXoiLCJlbWFpbCI6Imp1YW5Acm9kcmlndWV6Lm9yZyIsInN1YiI6Ikp1YW4gUm9kcmlndWV6IiwianRpIjoiODU1YzI5MDctMGU1Zi00MzY2LWExNzktOGI1YmVmZWY4YzRkIiwiaWF0IjoxNjc3NjExMDY5LCJleHAiOjE2Nzc2MTE5Njl9.', 'true');
INSERT INTO USERAPI(id_user, name, email, password, created, modified, last_login, token, is_active) VALUES('a266e990-f96e-44e8-b8fb-36a35be693f3' ,'Ana Parra', 'ana.parra@gmail.com', 'hunter4', CURRENT_DATE, CURRENT_DATE, CURRENT_DATE, 'eyJhbGciOiJub25lIn0.eyJuYW1lIjoiSnVhbiBSb2RyaWd1ZXoiLCJlbWFpbCI6Imp1YW5Acm9kcmlndWV6Lm9yZyIsInN1YiI6Ikp1YW4gUm9kcmlndWV6IiwianRpIjoiODU1YzI5MDctMGU1Zi00MzY2LWExNzktOGI1YmVmZWY4YzRkIiwiaWF0IjoxNjc3NjExMDY5LCJleHAiOjE2Nzc2MTE5Njl9.', 'true');
INSERT INTO USERAPI(id_user, name, email, password, created, modified, last_login, token, is_active) VALUES('a10b3f00-48c9-4151-a3ac-d39df04c55c2' ,'Edgar Lizcano', 'edgar@hotmail.com', 'hunter5', CURRENT_DATE, CURRENT_DATE, CURRENT_DATE, 'eyJhbGciOiJub25lIn0.eyJuYW1lIjoiSnVhbiBSb2RyaWd1ZXoiLCJlbWFpbCI6Imp1YW5Acm9kcmlndWV6Lm9yZyIsInN1YiI6Ikp1YW4gUm9kcmlndWV6IiwianRpIjoiODU1YzI5MDctMGU1Zi00MzY2LWExNzktOGI1YmVmZWY4YzRkIiwiaWF0IjoxNjc3NjExMDY5LCJleHAiOjE2Nzc2MTE5Njl9.', 'true');

INSERT INTO PHONES(number, city_code, country_code, id_user) VALUES(3001234567, 1, 57, '6e8b6014-2c70-478d-9bc1-e50deb22f46b');
INSERT INTO PHONES(number, city_code, country_code, id_user) VALUES(3007654321, 1, 58, '6e8b6014-2c70-478d-9bc1-e50deb22f46b');
INSERT INTO PHONES(number, city_code, country_code, id_user) VALUES(3101234567, 2, 59, 'ac975290-fbfa-4452-9507-0c98ffab8a3b');
INSERT INTO PHONES(number, city_code, country_code, id_user) VALUES(3051234567, 2, 42, 'f9f9547e-8a8a-4292-a1ab-5e3285e39678');
INSERT INTO PHONES(number, city_code, country_code, id_user) VALUES(3057654321, 3, 40, 'a266e990-f96e-44e8-b8fb-36a35be693f3');
INSERT INTO PHONES(number, city_code, country_code, id_user) VALUES(3201234567, 3, 10, 'a10b3f00-48c9-4151-a3ac-d39df04c55c2');