package DataGateWay;

import java.util.List;

import Node.FoodButton;
import Node.TableButton;

public interface FoodGateWayinterface {
	List<FoodButton> FetchFood() throws Exception;
	void UpdateTable(TableButton table) throws Exception;
	void DelleteTable(TableButton table) throws Exception;
	void AddTable(TableButton table) throws Exception;
	void close() throws Exception;
}
