
/*Define a class that represent a chess Tile, takes as paramenter a tile coordinate
  the key methods on there are: isTileOccupied and getPiece. We have also 2 subclasses
  of this Tile: EmptyTile and OccupiedTile which defines behaviors.
*
*/
public abstract class Tile {

    int tileCoordinate;

    Tile(int tileCoordinate){
        this.tileCoordinate = tileCoordinate;
    }

    public abstract boolean isTileOccupied();
    public abstract Piece getPiece();

    public static final class EmptyTile extends Tile{
        EmptyTile(int coordinate){
            super(coordinate);
        }

        @Override //This returns that Tile is not occupied
        public boolean isTileOccupied(){
            return false;
        }
        @Override
        public Piece getPiece(){
            return null;
        }
    }

    public static final class OccupiedTile extends Tile{
        Piece pieceOnTile;

        OccupiedTile(int tileCoordinate, Piece pieceOnTile){
            super(tileCoordinate);
            this.pieceOnTile = pieceOnTile;
        }

        @Override //This returns that Tile is occupied
        public boolean isTileOccupied(){
            return true;
        }

        @Override
        public Piece getPiece(){
            return this.pieceOnTile;
        }
    }
}