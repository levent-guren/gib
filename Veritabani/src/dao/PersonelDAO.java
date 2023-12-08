package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Personel;

public class PersonelDAO extends DAOBase {
	public List<Personel> getPersoneller() {
		List<Personel> personeller = new ArrayList<>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			stmt = getConnection().prepareStatement("select * from personel");
			rs = stmt.executeQuery();
			while (rs.next()) {
				Personel personel = new Personel();
				personel.setId(rs.getInt("id"));
				personel.setAdi(rs.getString("adi"));
				personel.setSoyadi(rs.getString("soyadi"));
				personel.setEmail(rs.getString("email"));

				personeller.add(personel);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(stmt, rs);
		}
		return personeller;
	}

	public void savePersonel(Personel personel) {
		PreparedStatement stmt = null;
		try {
			stmt = getConnection().prepareStatement(
					"insert into personel(adi, soyadi, email) values (?,?,?)");
			stmt.setString(1, personel.getAdi());
			stmt.setString(2, personel.getSoyadi());
			stmt.setString(3, personel.getEmail());
			stmt.execute();
			getConnection().commit();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(stmt, null);
		}
	}
}
