package DataGateWay;

import java.util.List;

import Node.TableButton;

public interface TableGateWayinterface {
	List<TableButton> FetchTable() throws Exception;
	void UpdateTable(TableButton table) throws Exception;
	void DelleteTable(TableButton table) throws Exception;
	void AddTable(TableButton table) throws Exception;
	void close() throws Exception;
}
