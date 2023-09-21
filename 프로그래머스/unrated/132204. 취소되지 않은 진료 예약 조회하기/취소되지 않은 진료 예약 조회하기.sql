-- 코드를 입력하세요
select bc.apnt_no, p.pt_name, p.pt_no, bc.mcdp_cd, bc.dr_name, bc.apnt_ymd
from (SELECT a.pt_no, a.apnt_no, a.mcdp_cd, d.dr_name, a.apnt_ymd
            from appointment a
                join doctor d
                    on a.mcdp_cd = d.dr_id
            where year(a.apnt_ymd) = 2022 and month(a.apnt_ymd) = 4 and day(a.apnt_ymd) = 13 and a.apnt_cncl_yn = 'N' and a.mcdp_cd = 'CS') bc
join patient p
on p.pt_no = bc.pt_no
order by bc.apnt_no;


SELECT BC.APNT_NO, A.PT_NAME, A.PT_NO, BC.MCDP_CD, BC.DR_NAME, BC.APNT_YMD
FROM (SELECT C.PT_NO, C.MCDP_CD, C.APNT_YMD, B.DR_NAME, C.APNT_NO
      FROM DOCTOR B
      JOIN APPOINTMENT C
      ON B.DR_ID = C.MDDR_ID
      WHERE DATE_FORMAT(C.APNT_YMD, '%Y-%m-%d') = '2022-04-13'
      AND C.MCDP_CD = 'CS'
      AND C.APNT_CNCL_YN = 'N') BC
JOIN PATIENT A
ON A.PT_NO = BC.PT_NO
ORDER BY BC.APNT_YMD ASC;