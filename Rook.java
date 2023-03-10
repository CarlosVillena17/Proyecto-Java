import javax.swing.ImageIcon;
import java.util.ArrayList;
// -------------------------------------------------------------------------
/**
 * Represents a Rook game piece.
 *
 * @author Ben Katz (bakatz)
 * @author Myles David II (davidmm2)
 * @author Danielle Bushrow (dbushrow)
 * @version 2010.11.17
 */
public class Rook
    extends ChessGamePiece{

    public Rook( ChessGameBoard board, int row, int col, int color ){
        super( board, row, col, color );
    }

    @Override
    protected ArrayList<String> calculatePossibleMoves( ChessGameBoard board ){
        ArrayList<String> northMoves = calculateNorthMoves( board, 8 );
        ArrayList<String> southMoves = calculateSouthMoves( board, 8 );
        ArrayList<String> westMoves = calculateWestMoves( board, 8 );
        ArrayList<String> eastMoves = calculateEastMoves( board, 8 );
        ArrayList<String> allMoves = new ArrayList<String>();
        ArrayList<String> movimientos=new ArrayList<>();
        ArrayList<String> movimientos2=new ArrayList<>();
        ArrayList<String> movimientos3=new ArrayList<>();
        ArrayList<String> movimientos4=new ArrayList<>();
        ArrayList<String> movimientos5=new ArrayList<>();
        ArrayList<String> movimiento6=new ArrayList<>();
        allMoves.addAll( northMoves );
        allMoves.addAll( southMoves );
        allMoves.addAll( westMoves );
        allMoves.addAll( eastMoves );
        return allMoves;
    }

    @Override
    public ImageIcon createImageByPieceType(){
        if ( getColorOfPiece() == ChessGamePiece.WHITE ){
            return new ImageIcon(
                getClass().getResource("chessImages/WhiteRook.gif")
            );            
        }
        else if ( getColorOfPiece() == ChessGamePiece.BLACK ){
            return new ImageIcon(
                getClass().getResource("chessImages/BlackRook.gif")
            );            
        }
        else
        {
            return new ImageIcon(
                getClass().getResource("chessImages/default-Unassigned.gif")
            );        
        }
    }
}
