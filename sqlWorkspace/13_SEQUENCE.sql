--SEQUENCE


/*
    <SEQUENCE>
        �������� ���������� �����ϴ� ������ �ϴ� ��ü�̴�.
        
    <SEQUENCE ����>
        [����]
            CREATE SEQUNCE ��������
            [START WITH ����]
            [INCREMENTBY ����]
            [MAXVALUE ����]
            [MINVALUE ����]
            [CYCLE | NOCYCLE]
            [CACHE ����Ʈũ�� | NOCACHE]; (�⺻�� 20 ����Ʈ)
            
        [��� ����]
            ��������.CURRVAL : ���� �������� ��
            ��������.NEXTVAL : ������ ���� ������Ű�� ������ ������ ��
                              (���� ������ ������ INCREAMENT �� ��ŭ ������ ��)
                              
        * ĳ�ø޸�
          - �̸� ���� ������ �����ؼ� �����صд�.
          - �Ź� ȣ���� ������ ������ ���� ���� ������ �ϴ� ���� �ƴ� ĳ�� �޸� ������ �̸� ������ ������ ����Ѵ�.
*/



/*
    <SEQUENCE ����>
        [ǥ����]
            ALTER SEQUENCE ��������
            [INCREAMENT BY ����]
            [MAXVALUE ����]
            [MINVALUE ����]
            [CYCLE | NOCYCLE]
            [CACHE ����Ʈũ�� | NOCACHE]; (�⺻�� 20 ����Ʈ)
            
        - START WITH�� ������ �Ұ����ϴ�. ��, �缳���ϰ� �ʹٸ� ������ �������� ���� �� �� �����ؾ� �Ѵ�.
*/

/*
    <SEQUENCE ����>
        DROP SEQUENCE ��������;
*/
-------------------------------------------------------------


DROP SEQUENCE ABC;
CREATE SEQUENCE ABC NOCACHE NOCYCLE;

SELECT ABC.NEXTVAL FROM DUAL;

