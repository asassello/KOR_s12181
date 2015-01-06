package edu.pjwstk.kor.queries;

import com.db4o.ObjectContainer;

import edu.pjwstk.kor.model.*;
import edu.pjwstk.kor.model.Shipment;
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


public class MyQuery_SbqlQuery52 {
    private com.db4o.ObjectContainer dataBase;

    public MyQuery_SbqlQuery52(final com.db4o.ObjectContainer dataBase) {
        this.dataBase = dataBase;
    }

    /**
     * original query='dataBase.( Shipment as sh where sh.isLost == true).(sh.sendDate as dataNadania,sh.deliveredDate as dataZgubienia,sh.sndr.name as imieNadawcy, sh.sndr.surname as nazwiskoNadawcy,  sh.sndr.city as miasto)'
     *
     * query after optimization='dataBase.(Shipment as sh where sh.getIsLost() == true).(sh.getSendDate() as dataNadania, sh.getDeliveredDate() as dataZgubienia, sh.getSndr().getName() as imieNadawcy, sh.getSndr().getSurname() as nazwiskoNadawcy, sh.getSndr().getCity() as miasto)'
    */
    public java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> executeQuery() {
        //evaluateExpression - start dataBase.(Shipment as sh where sh.getIsLost() == true).(sh.getSendDate() as dataNadania, sh.getDeliveredDate() as dataZgubienia, sh.getSndr().getName() as imieNadawcy, sh.getSndr().getSurname() as nazwiskoNadawcy, sh.getSndr().getCity() as miasto)
        //visitDotExpression - start dataBase.(Shipment as sh where sh.getIsLost() == true).(sh.getSendDate() as dataNadania, sh.getDeliveredDate() as dataZgubienia, sh.getSndr().getName() as imieNadawcy, sh.getSndr().getSurname() as nazwiskoNadawcy, sh.getSndr().getCity() as miasto)
        //visitDotExpression - start dataBase.(Shipment as sh where sh.getIsLost() == true)
        //visitIdentifierExpression - start dataBase
        com.db4o.ObjectContainer _ident_dataBase = dataBase;

        //visitIdentifierExpression - end dataBase
        java.util.Collection<edu.pjwstk.kor.model.Shipment> _dotResult1 = _ident_dataBase.query(new MyQuery_SbqlQuery52Db4o0());
        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _queryResult =
            new java.util.ArrayList<pl.wcislo.sbql4j.java.model.runtime.Struct>();
        int _dotIndex10 = 0;

        for (edu.pjwstk.kor.model.Shipment _dotEl10 : _dotResult1) {
            if (_dotEl10 == null) {
                continue;
            } //visitCommaExpression - start sh.getSendDate() as dataNadania, sh.getDeliveredDate() as dataZgubienia, sh.getSndr().getName() as imieNadawcy, sh.getSndr().getSurname() as nazwiskoNadawcy, sh.getSndr().getCity() as miasto
              //visitCommaExpression - start sh.getSendDate() as dataNadania, sh.getDeliveredDate() as dataZgubienia, sh.getSndr().getName() as imieNadawcy, sh.getSndr().getSurname() as nazwiskoNadawcy
              //visitCommaExpression - start sh.getSendDate() as dataNadania, sh.getDeliveredDate() as dataZgubienia, sh.getSndr().getName() as imieNadawcy
              //visitCommaExpression - start sh.getSendDate() as dataNadania, sh.getDeliveredDate() as dataZgubienia
              //visitAsExpression - start sh.getSendDate() as dataNadania
              //visitDotExpression - start sh.getSendDate()
              //visitIdentifierExpression - start sh

            edu.pjwstk.kor.model.Shipment _ident_sh1 = _dotEl10;

            //visitIdentifierExpression - end sh
            edu.pjwstk.kor.model.Shipment _dotEl2 = _ident_sh1;

            //visitMethodExpression - start getSendDate()
            java.util.Date _mth_getSendDateResult = _dotEl2.getSendDate();

            //visitMethodExpression - end getSendDate()
            //visitDotExpression - end sh.getSendDate()
            java.util.Date _asResult_dataNadania = _mth_getSendDateResult;

            //visitAsExpression - end sh.getSendDate() as dataNadania
            //visitAsExpression - start sh.getDeliveredDate() as dataZgubienia
            //visitDotExpression - start sh.getDeliveredDate()
            //visitIdentifierExpression - start sh
            edu.pjwstk.kor.model.Shipment _ident_sh2 = _dotEl10;

            //visitIdentifierExpression - end sh
            edu.pjwstk.kor.model.Shipment _dotEl3 = _ident_sh2;

            //visitMethodExpression - start getDeliveredDate()
            java.util.Date _mth_getDeliveredDateResult = _dotEl3.getDeliveredDate();

            //visitMethodExpression - end getDeliveredDate()
            //visitDotExpression - end sh.getDeliveredDate()
            java.util.Date _asResult_dataZgubienia = _mth_getDeliveredDateResult;

            //visitAsExpression - end sh.getDeliveredDate() as dataZgubienia
            //OperatorComma - start sh.getSendDate() as dataNadania, sh.getDeliveredDate() as dataZgubienia
            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult = OperatorUtils.cartesianProductSS(_asResult_dataNadania,
                    _asResult_dataZgubienia, "dataNadania", "dataZgubienia");

            //OperatorComma - end sh.getSendDate() as dataNadania, sh.getDeliveredDate() as dataZgubienia
            //visitCommaExpression - end sh.getSendDate() as dataNadania, sh.getDeliveredDate() as dataZgubienia
            //visitAsExpression - start sh.getSndr().getName() as imieNadawcy
            //visitDotExpression - start sh.getSndr().getName()
            //visitDotExpression - start sh.getSndr()
            //visitIdentifierExpression - start sh
            edu.pjwstk.kor.model.Shipment _ident_sh3 = _dotEl10;

            //visitIdentifierExpression - end sh
            edu.pjwstk.kor.model.Shipment _dotEl4 = _ident_sh3;

            //visitMethodExpression - start getSndr()
            edu.pjwstk.kor.model.Sender _mth_getSndrResult = _dotEl4.getSndr();

            //visitMethodExpression - end getSndr()
            //visitDotExpression - end sh.getSndr()
            edu.pjwstk.kor.model.Sender _dotEl5 = _mth_getSndrResult;

            //visitMethodExpression - start getName()
            java.lang.String _mth_getNameResult = _dotEl5.getName();

            //visitMethodExpression - end getName()
            //visitDotExpression - end sh.getSndr().getName()
            java.lang.String _asResult_imieNadawcy = _mth_getNameResult;

            //visitAsExpression - end sh.getSndr().getName() as imieNadawcy
            //OperatorComma - start sh.getSendDate() as dataNadania, sh.getDeliveredDate() as dataZgubienia, sh.getSndr().getName() as imieNadawcy
            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult1 = OperatorUtils.cartesianProductSS(_commaResult,
                    _asResult_imieNadawcy, "", "imieNadawcy");

            //OperatorComma - end sh.getSendDate() as dataNadania, sh.getDeliveredDate() as dataZgubienia, sh.getSndr().getName() as imieNadawcy
            //visitCommaExpression - end sh.getSendDate() as dataNadania, sh.getDeliveredDate() as dataZgubienia, sh.getSndr().getName() as imieNadawcy
            //visitAsExpression - start sh.getSndr().getSurname() as nazwiskoNadawcy
            //visitDotExpression - start sh.getSndr().getSurname()
            //visitDotExpression - start sh.getSndr()
            //visitIdentifierExpression - start sh
            edu.pjwstk.kor.model.Shipment _ident_sh4 = _dotEl10;

            //visitIdentifierExpression - end sh
            edu.pjwstk.kor.model.Shipment _dotEl6 = _ident_sh4;

            //visitMethodExpression - start getSndr()
            edu.pjwstk.kor.model.Sender _mth_getSndrResult1 = _dotEl6.getSndr();

            //visitMethodExpression - end getSndr()
            //visitDotExpression - end sh.getSndr()
            edu.pjwstk.kor.model.Sender _dotEl7 = _mth_getSndrResult1;

            //visitMethodExpression - start getSurname()
            java.lang.String _mth_getSurnameResult = _dotEl7.getSurname();

            //visitMethodExpression - end getSurname()
            //visitDotExpression - end sh.getSndr().getSurname()
            java.lang.String _asResult_nazwiskoNadawcy = _mth_getSurnameResult;

            //visitAsExpression - end sh.getSndr().getSurname() as nazwiskoNadawcy
            //OperatorComma - start sh.getSendDate() as dataNadania, sh.getDeliveredDate() as dataZgubienia, sh.getSndr().getName() as imieNadawcy, sh.getSndr().getSurname() as nazwiskoNadawcy
            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult2 = OperatorUtils.cartesianProductSS(_commaResult1,
                    _asResult_nazwiskoNadawcy, "", "nazwiskoNadawcy");

            //OperatorComma - end sh.getSendDate() as dataNadania, sh.getDeliveredDate() as dataZgubienia, sh.getSndr().getName() as imieNadawcy, sh.getSndr().getSurname() as nazwiskoNadawcy
            //visitCommaExpression - end sh.getSendDate() as dataNadania, sh.getDeliveredDate() as dataZgubienia, sh.getSndr().getName() as imieNadawcy, sh.getSndr().getSurname() as nazwiskoNadawcy
            //visitAsExpression - start sh.getSndr().getCity() as miasto
            //visitDotExpression - start sh.getSndr().getCity()
            //visitDotExpression - start sh.getSndr()
            //visitIdentifierExpression - start sh
            edu.pjwstk.kor.model.Shipment _ident_sh5 = _dotEl10;

            //visitIdentifierExpression - end sh
            edu.pjwstk.kor.model.Shipment _dotEl8 = _ident_sh5;

            //visitMethodExpression - start getSndr()
            edu.pjwstk.kor.model.Sender _mth_getSndrResult2 = _dotEl8.getSndr();

            //visitMethodExpression - end getSndr()
            //visitDotExpression - end sh.getSndr()
            edu.pjwstk.kor.model.Sender _dotEl9 = _mth_getSndrResult2;

            //visitMethodExpression - start getCity()
            java.lang.String _mth_getCityResult = _dotEl9.getCity();

            //visitMethodExpression - end getCity()
            //visitDotExpression - end sh.getSndr().getCity()
            java.lang.String _asResult_miasto = _mth_getCityResult;

            //visitAsExpression - end sh.getSndr().getCity() as miasto
            //OperatorComma - start sh.getSendDate() as dataNadania, sh.getDeliveredDate() as dataZgubienia, sh.getSndr().getName() as imieNadawcy, sh.getSndr().getSurname() as nazwiskoNadawcy, sh.getSndr().getCity() as miasto
            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult3 = OperatorUtils.cartesianProductSS(_commaResult2,
                    _asResult_miasto, "", "miasto");
            //OperatorComma - end sh.getSendDate() as dataNadania, sh.getDeliveredDate() as dataZgubienia, sh.getSndr().getName() as imieNadawcy, sh.getSndr().getSurname() as nazwiskoNadawcy, sh.getSndr().getCity() as miasto
            //visitCommaExpression - end sh.getSendDate() as dataNadania, sh.getDeliveredDate() as dataZgubienia, sh.getSndr().getName() as imieNadawcy, sh.getSndr().getSurname() as nazwiskoNadawcy, sh.getSndr().getCity() as miasto
            _queryResult.add(_commaResult3);
            _dotIndex10++;
        }

        //visitDotExpression - end dataBase.(Shipment as sh where sh.getIsLost() == true).(sh.getSendDate() as dataNadania, sh.getDeliveredDate() as dataZgubienia, sh.getSndr().getName() as imieNadawcy, sh.getSndr().getSurname() as nazwiskoNadawcy, sh.getSndr().getCity() as miasto)
        return _queryResult;

        //evaluateExpression - end dataBase.(Shipment as sh where sh.getIsLost() == true).(sh.getSendDate() as dataNadania, sh.getDeliveredDate() as dataZgubienia, sh.getSndr().getName() as imieNadawcy, sh.getSndr().getSurname() as nazwiskoNadawcy, sh.getSndr().getCity() as miasto)
    }
}
