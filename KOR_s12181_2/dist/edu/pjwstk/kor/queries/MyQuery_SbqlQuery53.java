package edu.pjwstk.kor.queries;

import com.db4o.ObjectContainer;

import edu.pjwstk.kor.model.*;
import edu.pjwstk.kor.model.Employee;
import edu.pjwstk.kor.model.data.*;

import org.apache.commons.collections.CollectionUtils;

import pl.wcislo.sbql4j.exception.*;
import pl.wcislo.sbql4j.java.model.compiletime.Signature.SCollectionType;
import pl.wcislo.sbql4j.java.model.runtime.*;
import pl.wcislo.sbql4j.java.model.runtime.factory.*;
import pl.wcislo.sbql4j.java.utils.ArrayUtils;
import pl.wcislo.sbql4j.java.utils.OperatorUtils;
import pl.wcislo.sbql4j.java.utils.Pair;
import pl.wcislo.sbql4j.lang.codegen.nostacks.*;
import pl.wcislo.sbql4j.lang.codegen.simple.*;
import pl.wcislo.sbql4j.lang.db4o.*;
import pl.wcislo.sbql4j.lang.db4o.codegen.*;
import pl.wcislo.sbql4j.lang.db4o.codegen.interpreter.*;
import pl.wcislo.sbql4j.lang.db4o.codegen.nostacks.*;
import pl.wcislo.sbql4j.lang.parser.expression.*;
import pl.wcislo.sbql4j.lang.parser.expression.OrderByParamExpression.SortType;
import pl.wcislo.sbql4j.lang.parser.terminals.*;
import pl.wcislo.sbql4j.lang.parser.terminals.operators.*;
import pl.wcislo.sbql4j.lang.types.*;
import pl.wcislo.sbql4j.lang.xml.*;
import pl.wcislo.sbql4j.model.*;
import pl.wcislo.sbql4j.model.collections.*;
import pl.wcislo.sbql4j.util.*;
import pl.wcislo.sbql4j.util.Utils;
import pl.wcislo.sbql4j.xml.model.*;
import pl.wcislo.sbql4j.xml.parser.store.*;

import java.sql.Struct;

import java.text.SimpleDateFormat;

import java.util.*;
import java.util.Date;


public class MyQuery_SbqlQuery53 {
    private com.db4o.ObjectContainer dataBase;

    public MyQuery_SbqlQuery53(final com.db4o.ObjectContainer dataBase) {
        this.dataBase = dataBase;
    }

    /**
     * original query='dataBase.( Employee as ee where ee.position != "Kierownik"  ).(ee.superior.name as ImiePrzelozonego, ee.superior.surname as NazwiskoPrzelozonego, ee.name as Imie, ee.surname as Nazwisko, ee.position as Stanowisko)'
     *
     * query after optimization='dataBase.(Employee as ee where ee.getPosition() != "Kierownik").(ee.getSuperior().getName() as ImiePrzelozonego, ee.getSuperior().getSurname() as NazwiskoPrzelozonego, ee.getName() as Imie, ee.getSurname() as Nazwisko, ee.getPosition() as Stanowisko)'
    */
    public java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> executeQuery() {
        //evaluateExpression - start dataBase.(Employee as ee where ee.getPosition() != "Kierownik").(ee.getSuperior().getName() as ImiePrzelozonego, ee.getSuperior().getSurname() as NazwiskoPrzelozonego, ee.getName() as Imie, ee.getSurname() as Nazwisko, ee.getPosition() as Stanowisko)
        //visitDotExpression - start dataBase.(Employee as ee where ee.getPosition() != "Kierownik").(ee.getSuperior().getName() as ImiePrzelozonego, ee.getSuperior().getSurname() as NazwiskoPrzelozonego, ee.getName() as Imie, ee.getSurname() as Nazwisko, ee.getPosition() as Stanowisko)
        //visitDotExpression - start dataBase.(Employee as ee where ee.getPosition() != "Kierownik")
        //visitIdentifierExpression - start dataBase
        com.db4o.ObjectContainer _ident_dataBase = dataBase;

        //visitIdentifierExpression - end dataBase
        java.util.Collection<edu.pjwstk.kor.model.Employee> _dotResult1 = _ident_dataBase.query(new MyQuery_SbqlQuery53Db4o0());
        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _queryResult =
            new java.util.ArrayList<pl.wcislo.sbql4j.java.model.runtime.Struct>();
        int _dotIndex9 = 0;

        for (edu.pjwstk.kor.model.Employee _dotEl9 : _dotResult1) {
            if (_dotEl9 == null) {
                continue;
            } //visitCommaExpression - start ee.getSuperior().getName() as ImiePrzelozonego, ee.getSuperior().getSurname() as NazwiskoPrzelozonego, ee.getName() as Imie, ee.getSurname() as Nazwisko, ee.getPosition() as Stanowisko
              //visitCommaExpression - start ee.getSuperior().getName() as ImiePrzelozonego, ee.getSuperior().getSurname() as NazwiskoPrzelozonego, ee.getName() as Imie, ee.getSurname() as Nazwisko
              //visitCommaExpression - start ee.getSuperior().getName() as ImiePrzelozonego, ee.getSuperior().getSurname() as NazwiskoPrzelozonego, ee.getName() as Imie
              //visitCommaExpression - start ee.getSuperior().getName() as ImiePrzelozonego, ee.getSuperior().getSurname() as NazwiskoPrzelozonego
              //visitAsExpression - start ee.getSuperior().getName() as ImiePrzelozonego
              //visitDotExpression - start ee.getSuperior().getName()
              //visitDotExpression - start ee.getSuperior()
              //visitIdentifierExpression - start ee

            edu.pjwstk.kor.model.Employee _ident_ee1 = _dotEl9;

            //visitIdentifierExpression - end ee
            edu.pjwstk.kor.model.Employee _dotEl2 = _ident_ee1;

            //visitMethodExpression - start getSuperior()
            edu.pjwstk.kor.model.Employee _mth_getSuperiorResult = _dotEl2.getSuperior();

            //visitMethodExpression - end getSuperior()
            //visitDotExpression - end ee.getSuperior()
            edu.pjwstk.kor.model.Employee _dotEl3 = _mth_getSuperiorResult;

            //visitMethodExpression - start getName()
            java.lang.String _mth_getNameResult = _dotEl3.getName();

            //visitMethodExpression - end getName()
            //visitDotExpression - end ee.getSuperior().getName()
            java.lang.String _asResult_ImiePrzelozonego = _mth_getNameResult;

            //visitAsExpression - end ee.getSuperior().getName() as ImiePrzelozonego
            //visitAsExpression - start ee.getSuperior().getSurname() as NazwiskoPrzelozonego
            //visitDotExpression - start ee.getSuperior().getSurname()
            //visitDotExpression - start ee.getSuperior()
            //visitIdentifierExpression - start ee
            edu.pjwstk.kor.model.Employee _ident_ee2 = _dotEl9;

            //visitIdentifierExpression - end ee
            edu.pjwstk.kor.model.Employee _dotEl4 = _ident_ee2;

            //visitMethodExpression - start getSuperior()
            edu.pjwstk.kor.model.Employee _mth_getSuperiorResult1 = _dotEl4.getSuperior();

            //visitMethodExpression - end getSuperior()
            //visitDotExpression - end ee.getSuperior()
            edu.pjwstk.kor.model.Employee _dotEl5 = _mth_getSuperiorResult1;

            //visitMethodExpression - start getSurname()
            java.lang.String _mth_getSurnameResult = _dotEl5.getSurname();

            //visitMethodExpression - end getSurname()
            //visitDotExpression - end ee.getSuperior().getSurname()
            java.lang.String _asResult_NazwiskoPrzelozonego = _mth_getSurnameResult;

            //visitAsExpression - end ee.getSuperior().getSurname() as NazwiskoPrzelozonego
            //OperatorComma - start ee.getSuperior().getName() as ImiePrzelozonego, ee.getSuperior().getSurname() as NazwiskoPrzelozonego
            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult = OperatorUtils.cartesianProductSS(_asResult_ImiePrzelozonego,
                    _asResult_NazwiskoPrzelozonego, "ImiePrzelozonego",
                    "NazwiskoPrzelozonego");

            //OperatorComma - end ee.getSuperior().getName() as ImiePrzelozonego, ee.getSuperior().getSurname() as NazwiskoPrzelozonego
            //visitCommaExpression - end ee.getSuperior().getName() as ImiePrzelozonego, ee.getSuperior().getSurname() as NazwiskoPrzelozonego
            //visitAsExpression - start ee.getName() as Imie
            //visitDotExpression - start ee.getName()
            //visitIdentifierExpression - start ee
            edu.pjwstk.kor.model.Employee _ident_ee3 = _dotEl9;

            //visitIdentifierExpression - end ee
            edu.pjwstk.kor.model.Employee _dotEl6 = _ident_ee3;

            //visitMethodExpression - start getName()
            java.lang.String _mth_getNameResult1 = _dotEl6.getName();

            //visitMethodExpression - end getName()
            //visitDotExpression - end ee.getName()
            java.lang.String _asResult_Imie = _mth_getNameResult1;

            //visitAsExpression - end ee.getName() as Imie
            //OperatorComma - start ee.getSuperior().getName() as ImiePrzelozonego, ee.getSuperior().getSurname() as NazwiskoPrzelozonego, ee.getName() as Imie
            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult1 = OperatorUtils.cartesianProductSS(_commaResult,
                    _asResult_Imie, "", "Imie");

            //OperatorComma - end ee.getSuperior().getName() as ImiePrzelozonego, ee.getSuperior().getSurname() as NazwiskoPrzelozonego, ee.getName() as Imie
            //visitCommaExpression - end ee.getSuperior().getName() as ImiePrzelozonego, ee.getSuperior().getSurname() as NazwiskoPrzelozonego, ee.getName() as Imie
            //visitAsExpression - start ee.getSurname() as Nazwisko
            //visitDotExpression - start ee.getSurname()
            //visitIdentifierExpression - start ee
            edu.pjwstk.kor.model.Employee _ident_ee4 = _dotEl9;

            //visitIdentifierExpression - end ee
            edu.pjwstk.kor.model.Employee _dotEl7 = _ident_ee4;

            //visitMethodExpression - start getSurname()
            java.lang.String _mth_getSurnameResult1 = _dotEl7.getSurname();

            //visitMethodExpression - end getSurname()
            //visitDotExpression - end ee.getSurname()
            java.lang.String _asResult_Nazwisko = _mth_getSurnameResult1;

            //visitAsExpression - end ee.getSurname() as Nazwisko
            //OperatorComma - start ee.getSuperior().getName() as ImiePrzelozonego, ee.getSuperior().getSurname() as NazwiskoPrzelozonego, ee.getName() as Imie, ee.getSurname() as Nazwisko
            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult2 = OperatorUtils.cartesianProductSS(_commaResult1,
                    _asResult_Nazwisko, "", "Nazwisko");

            //OperatorComma - end ee.getSuperior().getName() as ImiePrzelozonego, ee.getSuperior().getSurname() as NazwiskoPrzelozonego, ee.getName() as Imie, ee.getSurname() as Nazwisko
            //visitCommaExpression - end ee.getSuperior().getName() as ImiePrzelozonego, ee.getSuperior().getSurname() as NazwiskoPrzelozonego, ee.getName() as Imie, ee.getSurname() as Nazwisko
            //visitAsExpression - start ee.getPosition() as Stanowisko
            //visitDotExpression - start ee.getPosition()
            //visitIdentifierExpression - start ee
            edu.pjwstk.kor.model.Employee _ident_ee5 = _dotEl9;

            //visitIdentifierExpression - end ee
            edu.pjwstk.kor.model.Employee _dotEl8 = _ident_ee5;

            //visitMethodExpression - start getPosition()
            java.lang.String _mth_getPositionResult1 = _dotEl8.getPosition();

            //visitMethodExpression - end getPosition()
            //visitDotExpression - end ee.getPosition()
            java.lang.String _asResult_Stanowisko = _mth_getPositionResult1;

            //visitAsExpression - end ee.getPosition() as Stanowisko
            //OperatorComma - start ee.getSuperior().getName() as ImiePrzelozonego, ee.getSuperior().getSurname() as NazwiskoPrzelozonego, ee.getName() as Imie, ee.getSurname() as Nazwisko, ee.getPosition() as Stanowisko
            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult3 = OperatorUtils.cartesianProductSS(_commaResult2,
                    _asResult_Stanowisko, "", "Stanowisko");
            //OperatorComma - end ee.getSuperior().getName() as ImiePrzelozonego, ee.getSuperior().getSurname() as NazwiskoPrzelozonego, ee.getName() as Imie, ee.getSurname() as Nazwisko, ee.getPosition() as Stanowisko
            //visitCommaExpression - end ee.getSuperior().getName() as ImiePrzelozonego, ee.getSuperior().getSurname() as NazwiskoPrzelozonego, ee.getName() as Imie, ee.getSurname() as Nazwisko, ee.getPosition() as Stanowisko
            _queryResult.add(_commaResult3);
            _dotIndex9++;
        }

        //visitDotExpression - end dataBase.(Employee as ee where ee.getPosition() != "Kierownik").(ee.getSuperior().getName() as ImiePrzelozonego, ee.getSuperior().getSurname() as NazwiskoPrzelozonego, ee.getName() as Imie, ee.getSurname() as Nazwisko, ee.getPosition() as Stanowisko)
        return _queryResult;

        //evaluateExpression - end dataBase.(Employee as ee where ee.getPosition() != "Kierownik").(ee.getSuperior().getName() as ImiePrzelozonego, ee.getSuperior().getSurname() as NazwiskoPrzelozonego, ee.getName() as Imie, ee.getSurname() as Nazwisko, ee.getPosition() as Stanowisko)
    }
}
