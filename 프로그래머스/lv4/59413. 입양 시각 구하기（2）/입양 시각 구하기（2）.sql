-- 코드를 입력하세요
WITH RECURSIVE RES AS (
    SELECT 0 AS HOUR
    UNION ALL
    SELECT HOUR + 1 FROM RES WHERE HOUR < 23
)
SELECT
    HOUR,
    COUNT(A.ANIMAL_ID)
FROM 
    RES AS R
LEFT JOIN
    ANIMAL_OUTS AS A
    ON R.HOUR = HOUR(A.DATETIME)
GROUP BY
    R.HOUR