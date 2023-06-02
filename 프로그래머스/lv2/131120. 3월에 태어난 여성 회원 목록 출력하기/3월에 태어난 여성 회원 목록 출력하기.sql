-- 코드를 입력하세요
SELECT 
    MEMBER_ID,
    MEMBER_NAME,
    GENDER,
    DATE_FORMAT(date_of_birth, '%Y-%m-%d')
FROM member_profile
WHERE 
    MONTH(date_of_birth) = 3
AND gender = 'W'
AND tlno IS NOT NULL
ORDER BY member_id;