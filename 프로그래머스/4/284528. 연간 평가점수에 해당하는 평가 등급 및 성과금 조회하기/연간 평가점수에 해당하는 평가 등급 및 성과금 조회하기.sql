WITH EMPLOYEE_GRADES AS (
    SELECT
        E.EMP_NO,
        CASE
            WHEN AVG(G.SCORE) >= 96 THEN 'S'
            WHEN AVG(G.SCORE) >= 90 THEN 'A'
            WHEN AVG(G.SCORE) >= 80 THEN 'B'
            ELSE 'C'
        END AS GRADE
    FROM
        HR_EMPLOYEES AS E
    INNER JOIN
        HR_GRADE AS G
        ON E.EMP_NO = G.EMP_NO
    GROUP BY
        E.EMP_NO
)

SELECT
    E.EMP_NO,
    E.EMP_NAME,
    G.GRADE,
    ROUND(
        CASE G.GRADE
            WHEN 'S' THEN (SAL * 20 / 100)
            WHEN 'A' THEN (SAL * 15 / 100)
            WHEN 'B' THEN (SAL * 10 / 100)
            ELSE 0
        END
    ) AS BONUS
FROM
    HR_EMPLOYEES AS E
INNER JOIN
    EMPLOYEE_GRADES AS G
    ON E.EMP_NO = G.EMP_NO
ORDER BY
    E.EMP_NO
    