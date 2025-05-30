export interface Transaction {
  id?: number;
  fundName: string;
  type: string;
  amount: number;
  role: string;
}
