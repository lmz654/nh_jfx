package DataGateWay;

import java.util.List;

import Node.Table;

public interface TableGateWayinterface {
	List<Table> FetchTable() throws Exception;
	void UpdateTable(Table table) throws Exception;
	void DelleteTable(Table table) throws Exception;
	void AddTable(Table table) throws Exception;
}
