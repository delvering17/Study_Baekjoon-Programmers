WITH AVAILABLE_CARS AS (
    SELECT 
        C.*
    FROM 
        CAR_RENTAL_COMPANY_CAR AS C
    WHERE
        NOT EXISTS (
            SELECT
                1
            FROM
                CAR_RENTAL_COMPANY_RENTAL_HISTORY AS H
            WHERE
                C.CAR_ID = H.CAR_ID 
                AND H.START_DATE <= '2022-11-30'
                AND H.END_DATE >= '2022-11-01'
                
        )   
), RENTAL_30DAY_FEE AS (
    SELECT
        A.CAR_ID AS CAR_ID,
        A.CAR_TYPE AS CAR_TYPE,
        (A.DAILY_FEE * (1 - P.DISCOUNT_RATE / 100)) * 30 AS FEE
    FROM
        AVAILABLE_CARS AS A
    INNER JOIN
        CAR_RENTAL_COMPANY_DISCOUNT_PLAN AS P
        ON P.CAR_TYPE = A.CAR_TYPE
    WHERE
        P.DURATION_TYPE = '30일 이상'
)
SELECT 
    * 
FROM 
    RENTAL_30DAY_FEE
WHERE
    FEE BETWEEN 500000 AND 2000000
ORDER BY
    FEE DESC, CAR_TYPE, CAR_ID DESC
