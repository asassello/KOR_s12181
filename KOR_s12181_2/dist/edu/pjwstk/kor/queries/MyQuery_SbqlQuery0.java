package edu.pjwstk.kor.queries;

import com.db4o.ObjectContainer;

import edu.pjwstk.kor.model.*;
import edu.pjwstk.kor.model.Packagement;
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


public class MyQuery_SbqlQuery0 {
    private com.db4o.ObjectContainer dataBase;

    public MyQuery_SbqlQuery0(final com.db4o.ObjectContainer dataBase) {
        this.dataBase = dataBase;
    }

    /**
     * original query='dataBase.(avg(Shipment.Packagement.weight) as SredniaWagaPaczki)'
     *
     * query after optimization='dataBase.( avg(Shipment.Packagement.getWeight()) as SredniaWagaPaczki)'
    */
    public java.lang.Double executeQuery() {
        //evaluateExpression - start dataBase.( avg(Shipment.Packagement.getWeight()) as SredniaWagaPaczki)
        //visitDotExpression - start dataBase.( avg(Shipment.Packagement.getWeight()) as SredniaWagaPaczki)
        //visitIdentifierExpression - start dataBase
        com.db4o.ObjectContainer _ident_dataBase = dataBase;

        //visitIdentifierExpression - end dataBase
        java.lang.Double _queryResult = _ident_dataBase.query(new MyQuery_SbqlQuery0Db4o0());

        return _queryResult;

        //evaluateExpression - end dataBase.( avg(Shipment.Packagement.getWeight()) as SredniaWagaPaczki)
    }
}
