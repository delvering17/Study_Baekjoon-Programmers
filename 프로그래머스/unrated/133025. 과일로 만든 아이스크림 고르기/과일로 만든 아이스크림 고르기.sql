-- 코드를 입력하세요
SELECT
    I.FLAVOR
FROM
    ICECREAM_INFO AS I
LEFT JOIN
    FIRST_HALF AS H
    ON I.FLAVOR = H.FLAVOR
WHERE
    INGREDIENT_TYPE = 'fruit_based'
AND TOTAL_ORDER > 3000
ORDER BY
    TOTAL_ORDER DESC
    