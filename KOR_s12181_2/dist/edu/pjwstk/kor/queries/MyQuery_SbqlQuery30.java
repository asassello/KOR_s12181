package edu.pjwstk.kor.queries;

import com.db4o.ObjectContainer;

import edu.pjwstk.kor.model.*;
import edu.pjwstk.kor.model.Receiver;
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


public class MyQuery_SbqlQuery30 {
    private com.db4o.ObjectContainer dataBase;

    public MyQuery_SbqlQuery30(final com.db4o.ObjectContainer dataBase) {
        this.dataBase = dataBase;
    }

    /**
     * original query='dataBase.(Receiver where secondaryAdress != 0 ).(name as Imie, surname as Nazwisko, city as Miasto, emailAdress as email)'
     *
     * query after optimization='dataBase.(Receiver where getSecondaryAdress() != 0).(getName() as Imie, getSurname() as Nazwisko, getCity() as Miasto, getEmailAdress() as email)'
    */
    public java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> executeQuery() {
        //evaluateExpression - start dataBase.(Receiver where getSecondaryAdress() != 0).(getName() as Imie, getSurname() as Nazwisko, getCity() as Miasto, getEmailAdress() as email)
        //visitDotExpression - start dataBase.(Receiver where getSecondaryAdress() != 0).(getName() as Imie, getSurname() as Nazwisko, getCity() as Miasto, getEmailAdress() as email)
        //visitDotExpression - start dataBase.(Receiver where getSecondaryAdress() != 0)
        //visitIdentifierExpression - start dataBase
        com.db4o.ObjectContainer _ident_dataBase = dataBase;

        //visitIdentifierExpression - end dataBase
        java.util.Collection<edu.pjwstk.kor.model.Receiver> _dotResult = _ident_dataBase.query(new MyQuery_SbqlQuery30Db4o0());
        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _queryResult =
            new java.util.ArrayList<pl.wcislo.sbql4j.java.model.runtime.Struct>();
        int _dotIndex1 = 0;

        for (edu.pjwstk.kor.model.Receiver _dotEl1 : _dotResult) {
            if (_dotEl1 == null) {
                continue;
            } //visitCommaExpression - start getName() as Imie, getSurname() as Nazwisko, getCity() as Miasto, getEmailAdress() as email
              //visitCommaExpression - start getName() as Imie, getSurname() as Nazwisko, getCity() as Miasto
              //visitCommaExpression - start getName() as Imie, getSurname() as Nazwisko
              //visitAsExpression - start getName() as Imie
              //visitMethodExpression - start getName()

            java.lang.String _mth_getNameResult = _dotEl1.getName();

            //visitMethodExpression - end getName()
            java.lang.String _asResult_Imie = _mth_getNameResult;

            //visitAsExpression - end getName() as Imie
            //visitAsExpression - start getSurname() as Nazwisko
            //visitMethodExpression - start getSurname()
            java.lang.String _mth_getSurnameResult = _dotEl1.getSurname();

            //visitMethodExpression - end getSurname()
            java.lang.String _asResult_Nazwisko = _mth_getSurnameResult;

            //visitAsExpression - end getSurname() as Nazwisko
            //OperatorComma - start getName() as Imie, getSurname() as Nazwisko
            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult = OperatorUtils.cartesianProductSS(_asResult_Imie,
                    _asResult_Nazwisko, "Imie", "Nazwisko");

            //OperatorComma - end getName() as Imie, getSurname() as Nazwisko
            //visitCommaExpression - end getName() as Imie, getSurname() as Nazwisko
            //visitAsExpression - start getCity() as Miasto
            //visitMethodExpression - start getCity()
            java.lang.String _mth_getCityResult = _dotEl1.getCity();

            //visitMethodExpression - end getCity()
            java.lang.String _asResult_Miasto = _mth_getCityResult;

            //visitAsExpression - end getCity() as Miasto
            //OperatorComma - start getName() as Imie, getSurname() as Nazwisko, getCity() as Miasto
            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult1 = OperatorUtils.cartesianProductSS(_commaResult,
                    _asResult_Miasto, "", "Miasto");

            //OperatorComma - end getName() as Imie, getSurname() as Nazwisko, getCity() as Miasto
            //visitCommaExpression - end getName() as Imie, getSurname() as Nazwisko, getCity() as Miasto
            //visitAsExpression - start getEmailAdress() as email
            //visitMethodExpression - start getEmailAdress()
            java.lang.String _mth_getEmailAdressResult = _dotEl1.getEmailAdress();

            //visitMethodExpression - end getEmailAdress()
            java.lang.String _asResult_email = _mth_getEmailAdressResult;

            //visitAsExpression - end getEmailAdress() as email
            //OperatorComma - start getName() as Imie, getSurname() as Nazwisko, getCity() as Miasto, getEmailAdress() as email
            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult2 = OperatorUtils.cartesianProductSS(_commaResult1,
                    _asResult_email, "", "email");
            //OperatorComma - end getName() as Imie, getSurname() as Nazwisko, getCity() as Miasto, getEmailAdress() as email
            //visitCommaExpression - end getName() as Imie, getSurname() as Nazwisko, getCity() as Miasto, getEmailAdress() as email
            _queryResult.add(_commaResult2);
            _dotIndex1++;
        }

        //visitDotExpression - end dataBase.(Receiver where getSecondaryAdress() != 0).(getName() as Imie, getSurname() as Nazwisko, getCity() as Miasto, getEmailAdress() as email)
        return _queryResult;

        //evaluateExpression - end dataBase.(Receiver where getSecondaryAdress() != 0).(getName() as Imie, getSurname() as Nazwisko, getCity() as Miasto, getEmailAdress() as email)
    }
}
